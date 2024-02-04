module Main where
import Data.List (sort)


-- Questão 3
fatorial :: Int -> Int
fatorial x = if x > 0 then x * fatorial (x - 1)
             else 1

-- Questão 5
list_5a :: [Int]
list_5a = [k | n <- [10..40], let k = 2*n + 1]

list_5b :: [Int]
list_5b = [1..]

list_5c :: [Int]
list_5c = [x | x <-  list_5b, x /= 2, x /= 3, x /= 4, x /= 5] 


-- Questão 6

multiplicaListaPor3 :: [Int] -> [Int]
multiplicaListaPor3 xs = [3*x | x <- xs]

-- Questão 7
listaDePares :: [Int] -> [Int]
listaDePares xs = [x | x <- xs, even x]

-- Questão 9
listaDeTuplas :: [a] -> [b] -> [(a, b)]
listaDeTuplas [] _ = []  -- Casos base: lista vazia
listaDeTuplas _ [] = []  
listaDeTuplas (x:xs) (y:ys) = (x, y) : listaDeTuplas xs ys


-- Questão 10
concatenaLista :: [a] -> [a] -> [a]
concatenaLista l1 l2 = l1 ++ l2


-- Questão 11
ordenarLista :: Ord a => [a] -> [a]
ordenarLista = sort


-- Questão 12
somaPrimeiroSegundos :: [Int] -> Int
somaPrimeiroSegundos xs = sum (take 2 xs)

-- Questão 13
primeiroMenosRestante :: [Int] -> Int
primeiroMenosRestante xs = 2*(head xs) - (sum xs)

-- Questão 14
estaVazia :: [a] -> Bool
estaVazia = null


listaExemplo = [1,2,3,4,5]
listaExemplo2 = [10, 9, 8, 7, 6]
listaCharsExemplo = ['a', 'b', 'c', 'd', 'e']
main = do
  --Exemplos

  putStrLn "\n\n\nExemplos:"

  putStrLn "\n\nQuestão 3\n"
  
  putStrLn "Fatorial de 5:"
  print (fatorial 5)

  putStrLn "\nFatorial de 6:"
  print (fatorial 6)
  

  putStrLn "\n\n\nQuestão 5\n"
  
  putStrLn "a) S = {k| k = 2n+1 e {n ∈ N | 10 ≤ n ≤ 40 }"
  print list_5a

  putStrLn "\n\nb) C = {x| x ∈ N e (∀y)(y ∈ N → x ≤ y)}"
  print (take 10 list_5b)

  putStrLn "\n\nc) D = {x| x ∈ N e (∀y)(y ∈{2, 3, 4, 5} → x ≥ y)}"
  print (take 10 list_5c)


  putStrLn "\n\n\nQuestão 6\n"
  putStrLn (show listaExemplo ++ " multiplicado por 3:")
  print (multiplicaListaPor3 listaExemplo)

  putStrLn "\n\n\nQuestão 7\n"
  putStrLn ("numeros pares de " ++ show listaExemplo ++":")
  print (listaDePares listaExemplo)

  putStrLn "\n\n\nQuestão 8\n"
  putStrLn ("soma dos numeros de " ++ show listaExemplo ++":")
  print (sum listaExemplo)

  putStrLn "\n\n\nQuestão 9\n"
  putStrLn ("lista de tuplas de " ++ show listaExemplo ++ " e " ++ listaCharsExemplo ++ ":")
  print (listaDeTuplas listaExemplo listaCharsExemplo)


  putStrLn "\n\n\nQuestão 10\n"
  putStrLn ("concatenação de " ++ show listaExemplo ++ " e " ++ show listaExemplo2 ++ ":")
  print (concatenaLista listaExemplo listaExemplo2)

  putStrLn "\n\n\nQuestão 11\n"
  putStrLn ("lista ordenada de " ++ show listaExemplo2 ++ ":")
  print (ordenarLista listaExemplo2)

  putStrLn "\n\n\nQuestão 12\n"
  putStrLn ("soma dos primeiros dois numeros de " ++ show listaExemplo ++ ":")
  print (somaPrimeiroSegundos listaExemplo)

  putStrLn "\n\n\nQuestão 13\n"
  putStrLn ("primeiro menos restante de " ++ show listaExemplo ++ ":")
  print (primeiroMenosRestante listaExemplo)

  putStrLn "\n\n\nQuestão 14\n"
  putStrLn ("lista vazia de " ++ show listaExemplo ++ ":")
  print (estaVazia listaExemplo)

  