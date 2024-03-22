(defproject http-kit-uberjar-demo "0.0.1"
  :dependencies [[org.clojure/clojure "1.11.0"]
                 [http-kit "2.8.0-RC1"]]
  :main app
  :profiles {:uberjar
             {:aot :all}})
