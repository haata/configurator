(ns kii.test.runner
  (:require [cljs.test :as test :include-macros true :refer [report]]
            [kii.device.keyboard-test]
            [kii.ui.base.handlers-test]))

(defn run []
  (test/run-all-tests #"kii.*-test"))
