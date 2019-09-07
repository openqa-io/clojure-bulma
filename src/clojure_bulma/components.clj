(ns clojure-bulma.components
  (:require [hiccup.core :refer :all])
  (:require [clojure-bulma.utils :refer :all]))

(defn navbar-brand
  "Generate bulma navbar brand"
  [{:keys [class children] :as props}]
  [:div
   (attach-class-name props "navbar-brand")
   children])

(defn navbar-menu
  "Generate bulma navbar menu"
  [{:keys [class children] :as props}]
  [:div
   (attach-class-name props "navbar-menu")
   children])

(defn navbar-burger
  "Generate bulma navbar burger"
  [{:keys [class] :as props}]
  [:a
   (into  (attach-class-name props "navbar-burger") {:role "button"})
   (for [i (range 1 3)]
     [:span {:aria-hidden "true"}])
   ])

(defn navbar-start
  "Generate bulma navbar start"
  [{:keys [class children] :as props}]
  [:div
   (attach-class-name props "navbar-start")
   children
   ])

(defn navbar-end
  "Generate bulma navbar end"
  [{:keys [class children] :as props}]
  [:div
   (attach-class-name props "navbar-burger")
   children
   ])

(defn navbar-item-a
  "Generate bulma navbar item as <a>"
  [{:keys [class children] :as props}]
  [:a
   (attach-class-name props "navbar-item")
   children
   ])

(defn navbar-item-div
  "Generate bulma navbar item as <div>"
  [{:keys [class children] :as props}]
  [:div
   (attach-class-name props "navbar-item")
   children
   ])

(defn navbar-item-dropdown
  "Generate bulma navbar item with drop down"
  [{:keys [class children] :as props}]
  [:div
   (attach-class-name props "navbar-item has-dropdown")
   children
   ])

(defn navbar-dropdown
  "Generate bulma navbar item as <a>"
  [{:keys [class children] :as props}]
  [:div
   (attach-class-name props "navbar-item")
   children
   ])

(defn navbar-link
  "Generate bulma navbar drop down link as <a>"
  [{:keys [class children] :as props}]
  [:a
   (attach-class-name props "navbar-link")
   children
   ])

(defn navbar-divider
  "Generate bulma navbar divider as <hr>"
  [{:keys [class children] :as props}]
  [:hr
   (attach-class-name props "navbar-divider")
   children
   ])

(defn navbar
  "Generate bulma navbar"
  [{:keys [class children] :as props}]
  [:div
   (into (attach-class-name props "navbar") {:role "navigation" :aria-label "main navigation"})
   children])

