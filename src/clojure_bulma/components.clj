(ns clojure-bulma.components
  (:require [hiccup.core :refer :all])
  (:require [clojure-bulma.utils :refer :all]))

(defn navbar-brand
  "Generate bulma navbar brand"
  [{:keys [class children] :as props}]
  [:div
   (attach-class-name props "container")
   children])

(defn navbar-burger
  "Generate bulma navbar burger"
  [{:keys [class] :as props}]
  [:a
   (into  (attach-class-name props "navbar-burger") {:role "button"})
   (for [i (range 1 3)]
     [:span {:aria-hidden "true"}])
   ])

(defn navbar
  "Generate bulma navbar"
  [{:keys [class children] :as props}]
  [:div
   (attach-class-name props "container")
   children])

