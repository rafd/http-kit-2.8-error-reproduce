(ns app
  (:gen-class)
  (:require
    [org.httpkit.server :as s]
    [org.httpkit.client :as c]))

(defn -main [& args]
  (println (System/getProperty "java.version"))
  (println (first args))
  (case (first args)
    "client"
    (println (:status @(c/get "https://www.google.com")))
    "server"
    (s/run-server (fn [_request] {:status 200 :body "OK"})
                     {:port 8080})))
