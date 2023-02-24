package psbp.specification.function

private[psbp] trait Function[>-->[-_, +_], &&[+_, +_]]:

  // external declared

  def functionLift[Z, Y]: (Z => Y) => (Z >--> Y)

  def functionFromTuple2Lift[Z, Y, X]: (Tuple2[Z, Y] => X) => ((Z && Y) >--> X)
