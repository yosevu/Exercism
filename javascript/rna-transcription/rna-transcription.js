const NUCLEOTIDES = {
  G: 'C',
  C: 'G',
  T: 'A',
  A: 'U',
};

const transformStrand = dnaStrand =>dnaStrand
      .split('')
      .map(nucleotide => NUCLEOTIDES[nucleotide])
      .join('');

const toRna = dnaStrand =>
  (dnaStrand ? transformStrand(dnaStrand) : '');

export {
  toRna,
};
