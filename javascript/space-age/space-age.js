const EARTH_ORBITAL_PERIOD = 31557600
const ORBITAL_PERIODS = {
  mercury: 0.2408467,
  venus: 0.61519726,
  earth: 1,
  mars: 1.8808158,
  jupiter: 11.862615,
  saturn: 29.447498,
  uranus: 84.016846,
  neptune: 164.79132,
}

const orbitalPeriod = planet => ORBITAL_PERIODS[planet]

const yearsOnEarth = ageInSeconds => ageInSeconds / EARTH_ORBITAL_PERIOD

export const age = (planet, ageInSeconds) =>
  Number((yearsOnEarth(ageInSeconds) / orbitalPeriod(planet)).toFixed(2))
