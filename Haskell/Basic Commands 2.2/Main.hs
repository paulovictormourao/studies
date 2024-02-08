module Main where

data Term = Term Int Int   -- (coeficiente, grau)
type Polynomial = [Term]


merge :: [Term] -> [Term] -> [Term]
merge [] ys = ys
merge xs [] = xs
merge (x:xs) (y:ys)
  | compareByDegree x y == LT = x : merge xs (y:ys)
  | otherwise = y : merge (x:xs) ys

mergeSort :: (Term -> Term -> Ordering) -> [Term] -> [Term]
mergeSort _ [] = []
mergeSort compareFunc xs = mergeSort' compareFunc xs
  where
    mergeSort' _ [] = []
    mergeSort' _ [x] = [x]
    mergeSort' cmp xs' =
      merge (mergeSort' cmp firstHalf) (mergeSort' cmp secondHalf)
      where
        (firstHalf, secondHalf) = splitAt (length xs' `div` 2) xs'

-- Question 5
compareByDegree :: Term -> Term -> Ordering
compareByDegree (Term _ degree1) (Term _ degree2) = compare degree1 degree2

sortPolynomial :: Polynomial -> Polynomial
sortPolynomial [] = []
sortPolynomial [x] = [x]
sortPolynomial polynomial = mergeSort compareByDegree polynomial


-- 5.b
leadingCoefficient :: Polynomial -> Int
leadingCoefficient [] = 0  
leadingCoefficient polynomial = maximum [coef | Term coef _ <- polynomial]


normalizePolynomial :: Polynomial -> Polynomial
normalizePolynomial [] = []
normalizePolynomial polynomial =
  let maxCoefficient = leadingCoefficient polynomial
  in [Term (coef `div` maxCoefficient) degree | Term coef degree <- polynomial]


-- 5.c
addPolynomials :: Polynomial -> Polynomial -> Polynomial
addPolynomials [] ys = ys
addPolynomials xs [] = xs
addPolynomials (Term coef1 degree1 : xs) (Term coef2 degree2 : ys) =
  let sumTerm = Term (coef1 + coef2) degree1
  in sumTerm : addPolynomials xs ys


-- 5.d
evaluatePolynomial :: Polynomial -> Int -> Int
evaluatePolynomial [] _ = 0
evaluatePolynomial (Term coef degree : terms) x =
  coef * x ^ degree + evaluatePolynomial terms x


-- 5.e
degreeOfPolynomial :: Polynomial -> Int
degreeOfPolynomial [] = 0
degreeOfPolynomial (Term _ degree : terms) = max degree (degreeOfPolynomial terms)


-- 5.f
derivativeOfPolynomial :: Polynomial -> Polynomial
derivativeOfPolynomial [] = []
derivativeOfPolynomial (Term coef degree : terms) =
  if degree > 0
    then Term (coef * degree) (degree - 1) : derivativeOfPolynomial terms
    else derivativeOfPolynomial terms


-- 5.g
scaleTerm :: Term -> Polynomial -> Polynomial
scaleTerm _ [] = []
scaleTerm (Term coef degree) (Term c d : terms) =
  Term (coef * c) (degree + d) : scaleTerm (Term coef degree) terms

multiplyPolynomials :: Polynomial -> Polynomial -> Polynomial
multiplyPolynomials [] _ = []
multiplyPolynomials _ [] = []
multiplyPolynomials (x:xs) ys =
  addPolynomials (scaleTerm x ys) (multiplyPolynomials xs ys)



--Print Format Polynomial
printTerm :: Term -> String
printTerm (Term coef degree)
  | coef == 0 = "" 
  | degree == 0 = show coef
  | coef == 1 = "x^" ++ show degree
  | coef == -1 = "-x^" ++ show degree
  | otherwise = show coef ++ "x^" ++ show degree

printPolynomial :: Polynomial -> String
printPolynomial [] = "0"
printPolynomial [term] = printTerm term
printPolynomial (term:terms) =
  printTerm term ++ " + " ++ printPolynomial terms




main = do
  let poly1 = [Term 2 3, Term (-1) 2, Term 4 1, Term (-3) 0]
  let poly2 = [Term 1 2, Term 3 1, Term (-2) 0]
  
  putStrLn "Exemplo da função para ordenar um polinômio por ordem crescente de grau (a):"
  putStrLn $ "Polinômio original: " ++ printPolynomial poly1
  putStrLn $ "Polinômio ordenado: " ++ printPolynomial (sortPolynomial poly1)
  
  putStrLn "\nExemplo da função para normalizar um polinômio (b):"
  putStrLn $ "Polinômio original: " ++ printPolynomial poly1
  putStrLn $ "Polinômio normalizado: " ++ printPolynomial (normalizePolynomial poly1)
  
  putStrLn "\nExemplo da função para somar dois polinômios (c):"
  putStrLn $ "Polinômio 1: " ++ printPolynomial poly1
  putStrLn $ "Polinômio 2: " ++ printPolynomial poly2
  putStrLn $ "Soma dos polinômios: " ++ printPolynomial (addPolynomials poly1 poly2)
  
  let xValue = 2
  putStrLn "\nExemplo da função para calcular o valor de um polinômio num ponto (d):"
  putStrLn $ "Polinômio: " ++ printPolynomial poly1
  putStrLn $ "Valor do polinômio em x = " ++ show xValue ++ ": " ++ show (evaluatePolynomial poly1 xValue)
  
  putStrLn "\nExemplo da função que calcula o grau de um polinômio (e):"
  putStrLn $ "Polinômio: " ++ printPolynomial poly1
  putStrLn $ "Grau do polinômio: " ++ show (degreeOfPolynomial poly1)
  
  putStrLn "\nExemplo da função que calcula a derivada de um polinômio (f):"
  putStrLn $ "Polinômio: " ++ printPolynomial poly1
  putStrLn $ "Derivada do polinômio: " ++ printPolynomial (derivativeOfPolynomial poly1)
  
  putStrLn "\nExemplo da função que calcula o produto de dois polinômios (g):"
  putStrLn $ "Polinômio 1: " ++ printPolynomial poly1
  putStrLn $ "Polinômio 2: " ++ printPolynomial poly2
  putStrLn $ "Produto dos polinômios: " ++ printPolynomial (multiplyPolynomials poly1 poly2)