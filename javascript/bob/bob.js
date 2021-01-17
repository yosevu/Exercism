const isQuestion = m => m.trim().slice(-1) === '?'
const isUpperCase = m => m === m.toUpperCase() && m !== m.toLowerCase()
const isEmpty = m => m.trim() === ''

export const hey = m =>
  isQuestion(m) && !isUpperCase(m) ? "Sure."
: isUpperCase(m) && !isQuestion(m) ? "Whoa, chill out!"
: isQuestion(m) && isUpperCase(m)  ? "Calm down, I know what I'm doing!"
: isEmpty(m)                       ? "Fine. Be that way!"
: "Whatever."
