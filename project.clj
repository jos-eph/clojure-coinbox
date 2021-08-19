(defproject clojure-coinbox "0.1.0-SNAPSHOT"
  :description "A basic coinbox demonstration in clojure"
  :url "https://github.com/jos-eph/clojure-coinbox"
  :license {:name "AGPL 3.0"
            :url "https://www.gnu.org/licenses/agpl-3.0.en.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :main ^:skip-aot clojure-coinbox.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
