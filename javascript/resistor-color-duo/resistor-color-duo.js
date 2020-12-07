const COLORS = [
  'black',
  'brown',
  'red',
  'orange',
  'yellow',
  'green',
  'blue',
  'violet',
  'grey',
  'white'
]

const colorCode = color => COLORS.indexOf(color)

export const decodedValue = ([ tens, ones ]) => 10 * colorCode(tens) + colorCode(ones)
