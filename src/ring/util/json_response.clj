(ns ring.util.json-response
  (:require [cheshire.core :as json])
  (:use ring.util.response))

(defn json-response [data]
  (-> data
    json/generate-string
    response
    (content-type "application/json")))
