import numpy as np



word1 = 'clues'
word2 = 'blues'
s1 = len(word1)
s2 = len(word2)

answer = np.zeros((s1, s2), dtype=int)

for i in range(s1):
    for j in range(s2):
        if word1[i] == word2[j]:
            answer[i][j] += 1 + answer[i-1][j-1]
        else:
            answer[i][j] = max(answer[i-1][j], answer[i][j-1])

print(answer)
