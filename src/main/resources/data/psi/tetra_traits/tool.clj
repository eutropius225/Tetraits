(def pstool
  (reify
    vazkii.psi.common.item.tool.IPsimetalTool))

(fn [evt]
  (case evt
    "BREAK_BLOCK" (fn [stack world player pos xp setXp]
                    (.castOnBlockBreak pstool
                                       stack
                                       player))
    nil))