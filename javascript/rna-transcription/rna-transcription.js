const NUCLEOTIDES = {
  G: 'C',
  C: 'G',
  T: 'A',
  A: 'U',
}

const toRna = dnaStrand => dnaStrand
      .split('')
      .map(nucleotide => NUCLEOTIDES[nucleotide])
      .join('')

export {
  toRna,
}
