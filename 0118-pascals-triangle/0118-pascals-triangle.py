class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = []

        if numRows == 0 :
             return result
        
        result.append([1])
        for i in range (1, numRows):
            prev_row = result[i-1]
            row = [1]

            for j in range(1, len(prev_row)):
                row.append(prev_row[j-1] + prev_row[j])
            row.append(1)

            result.append(row)

        return result;




        