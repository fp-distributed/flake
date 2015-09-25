# flake
Decentralized, k-ordered unique ID generator.

Copy from https://github.com/Factual/skuld/blob/master/src/skuld/flake.clj
and
https://github.com/maxcountryman/flake


[![Clojars Project](http://clojars.org/tiensonqin/flake/latest-version.svg)]

## Usage
For example:

```clojure
=> (require '[flake.core :as flake])
=> (flake/init!)
;; encode default to base62, safe operation
=> (flake/id)
"GdYPPDcoLxO4NyoZRTVQHYj"
=> (flake/id {:encode :int})
114338374141286187205851229083666043835927N
=> (flake/id {:encode :int
              :unsafe? true}
6198295858610941460481N
=> (flake/id {:encode :bytes})
#object["[B" 0x61d495da "[B@61d495da"]
```
