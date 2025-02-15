package nomenclature

import anticipation.*
import fulminate.*
import proscenium.*

object MustNotEqual extends Rule({ text => m"must not equal $text"}, _ != _)

erased trait MustNotEqual[TextType <: Label] extends Check[TextType]
