module LeapYear (isLeapYear) where

isLeapYear :: Integer -> Bool
isLeapYear year = if rem year 400 == 0
                    then rem year 4 == 0 && rem year 100 == 0
                    else rem year 4 == 0 && rem year 100 /= 0
