(defproject http-kit-uberjar-demo "0.0.1"
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [http-kit "2.8.0-RC2"]
                 [com.github.clj-easy/graal-build-time "1.0.5"]]
  :main app.main
  :aot :all)
