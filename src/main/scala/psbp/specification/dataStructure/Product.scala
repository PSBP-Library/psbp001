package psbp.specification.dataStructure

private[psbp] trait Product[>-->[-_, +_], &&[+_, +_]]:

  // external declared

  def `(z&&y)>-->z`[Z, Y]: (Z && Y) >--> Z

  def `(z&&y)>-->y`[Z, Y]: (Z && Y) >--> Y

  extension [Z, Y, X](`z>-->y`: Z >--> Y) def &&(`z>-->x`: => Z >--> X): Z >--> (Y && X)

  extension [Z, Y, X, W](`z>-->x`: Z >--> X)
    def &&&(`y>-->w`: => Y >--> W): (Z && Y) >--> (X && W)

  def `(z&&y&&x)>-->z`[Z, Y, X]: (Z && Y && X) >--> Z

  def `(z&&y&&x)>-->y`[Z, Y, X]: (Z && Y && X) >--> Y

  def `(z&&y&&x)>-->x`[Z, Y, X]: (Z && Y && X) >--> X

  def `(z&&y&&x)>-->(y&&x)`[Z, Y, X]: (Z && Y && X) >--> (Y && X)

  def `(z&&y&&x)>-->(z&&x)`[Z, Y, X]: (Z && Y && X) >--> (Z && X)

  def `(z&&y&&x)>-->(z&&y)`[Z, Y, X]: (Z && Y && X) >--> (Z && Y)

  // ...
