const isQuestion = m => m.endsWith('?')
const isUpperCase = m => m === m.toUpperCase() && m !== m.toLowerCase()
const isEmpty = m => m === ''

const bob = m =>
  isQuestion(m) && !isUpperCase(m) ? "Sure."
: isUpperCase(m) && !isQuestion(m) ? "Whoa, chill out!"
: isQuestion(m) && isUpperCase(m)  ? "Calm down, I know what I'm doing!"
: isEmpty(m)                       ? "Fine. Be that way!"
: "Whatever."

export const hey = m => bob(m.trim())
