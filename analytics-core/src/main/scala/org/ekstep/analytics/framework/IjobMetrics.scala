package org.ekstep.analytics.framework

import org.apache.spark.SparkContext

trait IjobMetrics {
  def main(config: String, batchId: String)(implicit sc: Option[SparkContext] = None, fc: Option[FrameworkContext] = None);
}
