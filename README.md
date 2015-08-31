# flake
Decentralized, k-ordered unique ID generator.

Copy from https://github.com/Factual/skuld/blob/master/src/skuld/flake.clj
and
https://github.com/maxcountryman/flake

## Usage

For example:

```clojure
=> (require '[flake.core :as flake])
=> (flake/init!)
=> (flake/id)
"Ga4OtIWNrbC4guVc7NXv7eV"
=> (flake/id :int)
25978563106299135585558915252224N
=> (flake/id :bytes)
#object["[B" 0x61d495da "[B@61d495da"]
```
