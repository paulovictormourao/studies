module Main where
-- Question 1
sumAndProduct :: ((Int, Int), (Int, Int)) -> (Int, Int)
sumAndProduct ((s1, s2), (p1, p2)) = (s1 + s2, p1 * p2)

-- Question 2
findTwoLargest :: Int -> Int -> Int -> (Int, Int)
findTwoLargest a b c = (max (max a b) c, maximum (filter (/= max a b) [a, b, c]))

-- Question 3
checkTriangle :: Int -> Int -> Int -> Bool
checkTriangle a b c = a + b > c && a + c > b && b + c > a

-- Question 4
pythagoreanTriples :: Int -> [(Int, Int, Int)]
pythagoreanTriples n = [(x, y, z) | x <- [1..n], y <- [x..n], z <- [y..n], x^2 + y^2 == z^2]


main = do
  putStrLn $ "\n\nExemplos de uso:"

  -- Questão 1
  putStrLn $ "\nQuestão 1: " ++ show (sumAndProduct ((1, 2), (2, 3)))

  -- Questão 2
  putStrLn $ "\nQuestão 2: " ++ show (findTwoLargest 5 12 8)

  -- Questão 3
  putStrLn $ "\nQuestão 3: " ++ show (checkTriangle 3 4 5)

  -- Questão 4
  putStrLn $ "\nQuestão 4: " ++ show (pythagoreanTriples 10)
