package nomenclature

import anticipation.*
import fulminate.*
import proscenium.*

object MustMatch extends Rule
   ({ text => m"must match $text" }, { (text, param) => text.s.matches(param.s) })

erased trait MustMatch[TextType <: Label] extends Check[TextType]
