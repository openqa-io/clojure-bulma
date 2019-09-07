(ns clojure-bulma.layout
  (:require [hiccup.core :refer :all])
  (:require [clojure-bulma.utils :refer :all]))

(defn container
  "Generate bulma container"
  [{:keys [class children] :as props}]
  [:div
   (attach-class-name props "container")
   children])

(defn footer
  "Generate bulma footer"
  [{:keys [class children] :as props}]
  [:footer
   (attach-class-name props "footer")
   children])
