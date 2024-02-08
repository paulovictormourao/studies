module Main where

-- Question 6
insertionSort :: (Ord a) => [a] -> [a]
insertionSort [] = []
insertionSort (x:xs) = insert x (insertionSort xs)

insert :: (Ord a) => a -> [a] -> [a]
insert x [] = [x]
insert x (y:ys)
    | x <= y    = x : y : ys
    | otherwise = y : insert x ys


-- Question 7
selectionSort :: (Ord a) => [a] -> [a]
selectionSort [] = []
selectionSort xs = let smallest = minimum xs
                   in smallest : selectionSort (removeElement smallest xs)

removeElement :: (Eq a) => a -> [a] -> [a]
removeElement _ [] = []
removeElement x (y:ys)
    | x == y    = ys
    | otherwise = y : removeElement x ys


-- Question 8
mergeSort :: (Ord a) => [a] -> [a]
mergeSort [] = []
mergeSort [x] = [x]
mergeSort xs = merge (mergeSort primeiraMetade) (mergeSort segundaMetade)
    where
        (primeiraMetade, segundaMetade) = splitAt (length xs `div` 2) xs

merge :: (Ord a) => [a] -> [a] -> [a]
merge xs [] = xs
merge [] ys = ys
merge (x:xs) (y:ys)
    | x <= y    = x : merge xs (y:ys)
    | otherwise = y : merge (x:xs) ys



main = do
  let listaDesordenada = [4, 2, 8, 1, 6, 3, 7, 5]

  let listaOrdenadaInsertion = insertionSort listaDesordenada
  putStrLn $ "Lista ordenada (Insertion Sort): " ++ show listaOrdenadaInsertion

  let listaOrdenadaSelection = selectionSort listaDesordenada
  putStrLn $ "Lista ordenada (Selection Sort): " ++ show listaOrdenadaSelection

  let listaOrdenadaMerge = mergeSort listaDesordenada
  putStrLn $ "Lista ordenada (Merge Sort): " ++ show listaOrdenadaMerge