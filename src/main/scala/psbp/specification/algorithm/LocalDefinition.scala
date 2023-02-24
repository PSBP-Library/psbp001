package psbp.specification.algorithm

private[psbp] trait LocalDefinition[>-->[-_, +_], &&[+_, +_]]:

  // external defined

  def Let[Z, Y, X](`z>-->y`: Z >--> Y): In[Z, Y, X]

  // internal declared

  private[psbp] trait In[Z, Y, X]:
    def In(`(z&&y)>-->x`: => (Z && Y) >--> X): Z >--> X
