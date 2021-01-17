// Share: do statements
// Share: This week in ideas from other lands
// Share: Compare conditionals in rust, haskell, clojure, ruby, javascript, typescript, elixir
// Share: compare with if else if else else
// Poor man's pattern matching
const result = true ? "1"
             : true ? "2"
             : true ? "3"
             :         "default"

const result2 = false ? "1"
              : true  ? "2"
              : true  ? "3"
              :         "default"

const result3 = false ? "1"
              : false ? "2"
              : true  ? "3"
              :         "default"

const result4 = false ? "1"
              : false ? "2"
              : false ? "3"
              :         "default"

//
console.log(result)
console.log(result2)
console.log(result3)
console.log(result4)
