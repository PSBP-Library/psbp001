package psbp.specification.algorithm

trait Algorithm[>-->[-_, +_], &&[+_, +_]]
    extends IfThenElse[>-->],
      LocalDefinition[>-->, &&],
      SequentialComposition[>-->]
