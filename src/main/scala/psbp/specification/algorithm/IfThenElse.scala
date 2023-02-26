package psbp.specification.algorithm

private[psbp] trait IfThenElse[>-->[-_, +_]]:

  // external declared

  def If[Z, Y](`z>-->b`: Z >--> Boolean): Then[Z, Y]

  // internal declared

  private[psbp] trait Then[Z, Y]:
    def Then(`z>-t->y`: => Z >--> Y): Else[Z, Y]

  private[psbp] trait Else[Z, Y]:
    def Else(`z>-f->y`: => Z >--> Y): Z >--> Y
