const parseMatrix = matrixString => matrixString
      .split('\n')
      .map(row => row.split(' ').map(Number))

const transpose = m => m[0].map((_, i) => m.map(row => row[i]))

export const matrix = matrixString => {
  const rows = parseMatrix(matrixString)
  return {
    rows,
    columns: transpose(rows),
  }
}
