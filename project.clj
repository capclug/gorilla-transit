(defproject gorilla-transit "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot gorilla-transit.core
  :target-path "target/%s"
  :plugins [[lein-gorilla "0.3.2" ]]
  :profiles {:uberjar {:aot :all}})
