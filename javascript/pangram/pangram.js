export const isPangram = sentence =>
  Boolean(sentence) &&
  new Set(sentence.toLowerCase().match(/[a-z]/gi)).size === 26
