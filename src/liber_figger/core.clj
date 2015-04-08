(ns liber-figger.core
  (:gen-class)
  (:require [liberator.core :refer [resource defresource]]
            [ring.middleware.params :refer [wrap-params]]
            [compojure.core :refer [defroutes ANY]]
            [ring.adapter.jetty :refer :all]))

(defroutes app
  (ANY "/"
    []
      (resource :available-media-types ["text/html"]
      	  		:handle-ok (fn [_] (str "Hello from liber-figger")))))

(def handler
  (-> app
      wrap-params))

(defn start-server
  []
  (run-jetty handler {:port 3000 :join? false}))

(defn -main [& args]
  (start-server))
