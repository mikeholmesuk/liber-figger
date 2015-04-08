(defproject liber-figger "0.1.0-SNAPSHOT"
  :description "A (very) basic Compujure/ Liberator project running on Docker & Fig"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-ring "0.9.3"]]
  :main liber-figger.core
  :uberjar-name "liber-figger.jar"
  :ring { :handler liber-figger.core/handler}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [liberator "0.12.2"]
                 [compojure "1.3.3"]
                 [ring/ring-core "1.3.2"]
                 [ring/ring-jetty-adapter "1.3.2"]])
