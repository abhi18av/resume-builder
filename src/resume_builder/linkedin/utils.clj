(ns resume-builder.linkedin.utils
  (:require [clojure.data.csv :as csv]
            [clojure.java.io :as io]))

;; Reading from actual fields

(def resume
  {:causes
   (csv/read-csv (io/reader "./resources/Basic_LinkedInDataExport_12-01-2018/Causes You Care About.csv"))

   :certifications
   (csv/read-csv (io/reader "./resources/Basic_LinkedInDataExport_12-01-2018/Certifications.csv"))

   :courses
   (csv/read-csv (io/reader "./resources/Basic_LinkedInDataExport_12-01-2018/Courses.csv"))

   :education
   (csv/read-csv (io/reader "./resources/Basic_LinkedInDataExport_12-01-2018/Education.csv"))

   :languages
   (csv/read-csv (io/reader "./resources/Basic_LinkedInDataExport_12-01-2018/Languages.csv"))

   :positions
   (csv/read-csv (io/reader "./resources/Basic_LinkedInDataExport_12-01-2018/Positions.csv"))

   :profiles
   (csv/read-csv (io/reader "./resources/Basic_LinkedInDataExport_12-01-2018/Profile.csv"))

   :projects
   (csv/read-csv (io/reader "./resources/Basic_LinkedInDataExport_12-01-2018/Projects.csv"))

   :skills
   (csv/read-csv (io/reader "./resources/Basic_LinkedInDataExport_12-01-2018/Skills.csv"))})

