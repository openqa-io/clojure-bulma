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

(defn hero
  "Generate bulma hero"
  [{:keys [class children] :as props}]
  [:section
   (attach-class-name props "hero")
   children])

(defn hero-body
  "Generate bulma hero body"
  [{:keys [class children] :as props}]
  [:div
   (attach-class-name props "hero-body")
   children])
