export class Matrix {
  constructor(matrixString) {
    this.matrix = this.parseMatrix(matrixString)
    this.transposedMatrix = this.transpose(this.matrix)
  }

  get rows() {
    return this.matrix
  }

  get columns() {
    return this.transposedMatrix
  }

  parseMatrix = (matrixString) => matrixString
    .split('\n')
    .map(row => row.split(' ').map(Number))

  transpose = (matrix) => matrix[0]
    .map((_, columnIndex) => matrix.map(row => row[columnIndex]))
}
