(ns ring.util.json-response
  (:require [cheshire.core :as json]))

(defn json-response [data]
  {:status 200
   :headers {"Content-Type" "application/json"}
   :body (json/generate-string data)})
