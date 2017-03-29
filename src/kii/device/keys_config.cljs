(ns kii.device.keys-config)

;;TODO - Move to better namespace.

(defonce defaults
         [[:a "A" nil :core]
          [:b "B" nil :core]
          [:c "C" nil :core]
          [:d "D" nil :core]
          [:e "E" nil :core]
          [:f "F" nil :core]
          [:g "G" nil :core]
          [:h "H" nil :core]
          [:i "I" nil :core]
          [:j "J" nil :core]
          [:k "K" nil :core]
          [:l "L" nil :core]
          [:m "M" nil :core]
          [:n "N" nil :core]
          [:o "O" nil :core]
          [:p "P" nil :core]
          [:q "Q" nil :core]
          [:r "R" nil :core]
          [:s "S" nil :core]
          [:t "T" nil :core]
          [:u "U" nil :core]
          [:v "V" nil :core]
          [:w "W" nil :core]
          [:x "X" nil :core]
          [:y "Y" nil :core]
          [:z "Z" nil :core]
          [:0 "0" nil :core]
          [:1 "1" nil :core]
          [:2 "2" nil :core]
          [:3 "3" nil :core]
          [:4 "4" nil :core]
          [:5 "5" nil :core]
          [:6 "6" nil :core]
          [:7 "7" nil :core]
          [:8 "8" nil :core]
          [:9 "9" nil :core]
          [:0 "0" nil :core]
          [:backsp "BKSP" ["BACKSPACE"] :std]
          [:tab "TAB" nil :std]
          [:enter "↵" ["ENTER"] :std]
          [:lshift "L⇑" ["LSHIFT" "LEFT SHIFT" "SHIFT"] :std]
          [:rshift "R⇑" ["RSHIFT" "RIGHT SHIFT"] :std]
          [:lctrl "LCTRL" ["LCTRL" "LEFT CTRL" "CTRL" "LEFT CONTROL" "CONTROL"] :std]
          [:rctrl "RCTRL" ["RCTRL" "RIGHT CTRL" "RIGHT CONTROL"] :std]
          [:lalt "LALT" ["LALT" "LEFT ALT" "ALT" "ALTERNATE" "LEFT ALTERNATE"] :std]
          [:ralt "RALT" ["RALT" "RIGHT ALT" "RIGHTT ALTERNATE"] :std]
          [:pause "PAUSE" nil :std]
          [:caps "CAPSLK" ["CAPSLOCK" "CAPSLOCK"] :std]
          [:esc "ESC" ["ESC" "ESCAPE"] :std]
          [:space "[ ]" ["SPACE" "SPACEBAR"] :std]
          [:pgup "PGUP" ["PAGEUP" "PAGE UP"] :std]
          [:pgup "PGDN" ["PAGEDOWN" "PAGE DOWN"] :std]
          [:end "END" nil :std]
          [:home "HOME" nil :std]
          [:left "←" ["LEFT"] :std]
          [:up "↑" ["UP"] :std]
          [:right "→" ["RIGHT"] :std]
          [:down "↓" ["DOWN"] :std]
          [:prsc "PRSC" ["PRINTSCREEN" "PRINT SCREEN"] :std]
          [:ins "INS" ["INSERT"] :std]
          [:del "DEL" ["DELETE"] :std]
          [:semi ";" [";" "SEMICOLON"] :core]
          [:= "=" ["=" "EQUALS" "EQUAL"] :core]
          [:lgui "LGUI" ["LGUI" "LEFT GUI" "GUI" "SUPER" "LEFT SUPER" "WINDOWS" "LEFT WINDOWS" "WIN" "LEFT WIN"] :std]
          [:rgui "RGUI" ["RGUI" "RIGHT GUI" "RIGHT SUPER" "RIGHT WINDOWS" "RIGHT WIN"] :std]
          [:menu "MENU" nil :std]
          [:p0 "P0" ["P0" "KEYPAD 0"] :num]
          [:p1 "P1" ["P1" "KEYPAD 1"] :num]
          [:p2 "P2" ["P2" "KEYPAD 2"] :num]
          [:p3 "P3" ["P3" "KEYPAD 3"] :num]
          [:p4 "P4" ["P4" "KEYPAD 4"] :num]
          [:p5 "P5" ["P5" "KEYPAD 5"] :num]
          [:p6 "P6" ["P6" "KEYPAD 6"] :num]
          [:p7 "P7" ["P7" "KEYPAD 7"] :num]
          [:p8 "P8" ["P8" "KEYPAD 8"] :num]
          [:p9 "P9" ["P9" "KEYPAD 9"] :num]
          [:p* "P*" ["P*" "KEYPAD ASTRIX" "KEYPAD ASTERISK"] :num]
          [:p+ "P+" ["KEYPAD PLUS" "P+"] :num]
          [:p- "P-" ["P-" "KEYPAD MINUS"] :num]
          [:p. "P." ["P." "KEYPAD PERIOD"] :num]
          [:pdiv "P/" ["P/" "KEYPAD SLASH"] :num]
          [:pcomma "P," ["P,"] :num] ;; Should probably be in P. as it's actually decimal-sep
          [:p= "P=" ["P=" "KEYPAD EQUAL"] :num]
          [:pent "P↵" ["PENTER" "KEYPAD ENTER"] :num]
          [:f1 "F1" nil :std]
          [:f2 "F2" nil :std]
          [:f3 "F3" nil :std]
          [:f4 "F4" nil :std]
          [:f5 "F5" nil :std]
          [:f6 "F6" nil :std]
          [:f7 "F7" nil :std]
          [:f8 "F8" nil :std]
          [:f9 "F9" nil :std]
          [:f10 "F10" nil :std]
          [:f11 "F11" nil :std]
          [:f12 "F12" nil :std]
          [:f13 "F13" nil :std]
          [:f14 "F14" nil :std]
          [:f15 "F15" nil :std]
          [:f16 "F16" nil :std]
          [:f17 "F17"]
          [:f18 "F18"]
          [:f19 "F19"]
          [:f20 "F20"]
          [:f21 "F21"]
          [:f22 "F22"]
          [:f23 "F23"]
          [:f24 "F24"]
          [:nmlk "NMLK" ["NUMLOCK" "NUM LOCK"] :std]
          [:sclk "SCLK" ["SCROLLLOCK" "SCROLL LOCK"] :std]
          [:comma "," ["," "COMMA"] :core]
          [:- "-" ["-" "MINUS"] :core]
          [:. "." ["." "PERIOD"] :core]
          [:slash "/" ["/" "SLASH"] :core]
          [:btick "`" ["`" "BACKTICK"] :core]
          [:lbr "[" ["[" "LBRACE" "LEFT BRACE"] :core]
          [:bslash "\\" ["\\" "BACKSLASH"] :core]
          [:rbr "]" ["]" "RBRACE" "RIGHT BRACE"] :core]
          [:quote "'" ["'" "QUOTE" "SINGLE QUOTE"] :core]

          [:none "NONE" ["#:None"] :spec]
          [:nxfn "NEXT-ƒ" ["NEXT LAYER" "NLayer"] :spec]
          [:pvfn "PREV-ƒ" ["PREV LAYER" "PLayer"] :spec]
          [:fn1 "ƒ1" ["FUN1" "FUNCTION1" "FUN"] :spec]
          [:fn2 "ƒ2" ["FUN2" "FUNCTION2"] :spec]
          [:fn3 "ƒ3" ["FUN3" "FUNCTION3"] :spec]
          [:fn4 "ƒ4" ["FUN4" "FUNCTION4"] :spec]
          [:fn5 "ƒ5" ["FUN5" "FUNCTION5"] :spec]
          [:fn6 "ƒ6" ["FUN6" "FUNCTION6"] :spec]
          [:fn7 "ƒ7" ["FUN7" "FUNCTION7"] :spec]
          [:fn8 "ƒ8" ["FUN8" "FUNCTION8"]]
          [:fn9 "ƒ9" ["FUN9" "FUNCTION9"]]
          [:fn10 "ƒ10" ["FUN10" "FUNCTION10"]]
          [:fn11 "ƒ11" ["FUN11" "FUNCTION11"]]
          [:fn12 "ƒ12" ["FUN12" "FUNCTION12"]]
          [:fn13 "ƒ13" ["FUN13" "FUNCTION13"]]
          [:fn14 "ƒ14" ["FUN14" "FUNCTION14"]]
          [:fn15 "ƒ15" ["FUN15" "FUNCTION15"]]
          [:fn16 "ƒ16" ["FUN16" "FUNCTION16"]]

          [:lck1 "LOCK-1" ["LCK1" "LOCK1" "LCK"] :spec]
          [:lck2 "LOCK-2" ["LCK2" "LOCK2"] :spec]
          [:lck3 "LOCK-3" ["LCK3" "LOCK3"] :spec]
          [:lck4 "LOCK-4" ["LCK4" "LOCK4"] :spec]
          [:lck5 "LOCK-5" ["LCK5" "LOCK5"] :spec]
          [:lck6 "LOCK-6" ["LCK6" "LOCK6"] :spec]
          [:lck7 "LOCK-7" ["LCK7" "LOCK7"] :spec]
          [:lck8 "LOCK-8" ["LCK8" "LOCK8"]]
          [:lck9 "LOCK-9" ["LCK9" "LOCK9"]]
          [:lck10 "LOCK-10" ["LCK10" "LOCK10"]]
          [:lck11 "LOCK-11" ["LCK11" "LOCK11"]]
          [:lck12 "LOCK-12" ["LCK12" "LOCK12"]]
          [:lck13 "LOCK-13" ["LCK13" "LOCK13"]]
          [:lck14 "LOCK-14" ["LCK14" "LOCK14"]]
          [:lck15 "LOCK-15" ["LCK15" "LOCK15"]]
          [:lck16 "LOCK-16" ["LCK16" "LOCK16"]]

          [:lat1 "LATCH-1" ["LAT1" "LATCH1" "LAT"] :spec]
          [:lat2 "LATCH-2" ["LAT2" "LATCH2"] :spec]
          [:lat3 "LATCH-3" ["LAT3" "LATCH3"] :spec]
          [:lat4 "LATCH-4" ["LAT4" "LATCH4"] :spec]
          [:lat5 "LATCH-5" ["LAT5" "LATCH5"] :spec]
          [:lat6 "LATCH-6" ["LAT6" "LATCH6"] :spec]
          [:lat7 "LATCH-7" ["LAT7" "LATCH7"] :spec]
          [:lat8 "LATCH-8" ["LAT8" "LATCH8"]]
          [:lat9 "LATCH-9" ["LAT9" "LATCH9"]]
          [:lat10 "LATCH-10" ["LAT10" "LATCH10"]]
          [:lat11 "LATCH-11" ["LAT11" "LATCH11"]]
          [:lat12 "LATCH-12" ["LAT12" "LATCH12"]]
          [:lat13 "LATCH-13" ["LAT13" "LATCH13"]]
          [:lat14 "LATCH-14" ["LAT14" "LATCH14"]]
          [:lat15 "LATCH-15" ["LAT15" "LATCH15"]]
          [:lat16 "LATCH-16" ["LAT16" "LATCH16"]]

          [:led+ "LED+" ["#:ledControl( 4, 15, 0 )"] :spec]
          [:led- "LED-" ["#:ledControl( 3, 15, 0 )"] :spec]
          [:led0 "LED OFF" ["#:ledControl( 5, 0, 0 )"] :spec]
          [:flash "FLASH" ["#:flashMode()"] :spec]
          [:kro "6/N-KRO" ["#:toggleKbdProtocol()"] :spec]

          ;; i11n
          ;; mouse
          ;; macros
          ;; multimedia
          ;; other stuff...
          ])
