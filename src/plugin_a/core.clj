(ns plugin-a.core
  (:require [clojure.tools.cli :refer [parse-opts]]))

(defn init []
  (println "------>>>plugin-a loaded<<<--------"))


(defn -main [& args] (println "hello world"))
