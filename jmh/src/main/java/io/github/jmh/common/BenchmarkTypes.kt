package io.github.jmh.common

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

@Serializable
data class DummyRequest(val payload: BenchmarkData) {
  companion object {
    fun dummy(): DummyRequest {
      return DummyRequest(payload = BenchmarkData.dummy())
    }
  }
  fun toJson(): String {
    return Json.encodeToString(serializer(), this)
  }
}

@Serializable
data class DummyResponse(val result: List<BenchmarkData>) {
  companion object {
    /** 10 items in the list */
    const val dummyJson =
      """
      {"result":[{"someInt":1,"someMap":{"item-0":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-1":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-2":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-3":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-4":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-5":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-6":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-7":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-8":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-9":"7ab8785a-c71e-485d-953f-0b0629c1a625"},"someSet":["0-7ab8785a-c71e-485d-953f-0b0629c1a625","1-7ab8785a-c71e-485d-953f-0b0629c1a625","2-7ab8785a-c71e-485d-953f-0b0629c1a625","3-7ab8785a-c71e-485d-953f-0b0629c1a625","4-7ab8785a-c71e-485d-953f-0b0629c1a625","5-7ab8785a-c71e-485d-953f-0b0629c1a625","6-7ab8785a-c71e-485d-953f-0b0629c1a625","7-7ab8785a-c71e-485d-953f-0b0629c1a625","8-7ab8785a-c71e-485d-953f-0b0629c1a625","9-7ab8785a-c71e-485d-953f-0b0629c1a625","10-7ab8785a-c71e-485d-953f-0b0629c1a625","11-7ab8785a-c71e-485d-953f-0b0629c1a625","12-7ab8785a-c71e-485d-953f-0b0629c1a625","13-7ab8785a-c71e-485d-953f-0b0629c1a625","14-7ab8785a-c71e-485d-953f-0b0629c1a625","15-7ab8785a-c71e-485d-953f-0b0629c1a625","16-7ab8785a-c71e-485d-953f-0b0629c1a625","17-7ab8785a-c71e-485d-953f-0b0629c1a625","18-7ab8785a-c71e-485d-953f-0b0629c1a625","19-7ab8785a-c71e-485d-953f-0b0629c1a625"]},{"someInt":1,"someMap":{"item-0":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-1":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-2":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-3":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-4":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-5":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-6":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-7":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-8":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-9":"7ab8785a-c71e-485d-953f-0b0629c1a625"},"someSet":["0-7ab8785a-c71e-485d-953f-0b0629c1a625","1-7ab8785a-c71e-485d-953f-0b0629c1a625","2-7ab8785a-c71e-485d-953f-0b0629c1a625","3-7ab8785a-c71e-485d-953f-0b0629c1a625","4-7ab8785a-c71e-485d-953f-0b0629c1a625","5-7ab8785a-c71e-485d-953f-0b0629c1a625","6-7ab8785a-c71e-485d-953f-0b0629c1a625","7-7ab8785a-c71e-485d-953f-0b0629c1a625","8-7ab8785a-c71e-485d-953f-0b0629c1a625","9-7ab8785a-c71e-485d-953f-0b0629c1a625","10-7ab8785a-c71e-485d-953f-0b0629c1a625","11-7ab8785a-c71e-485d-953f-0b0629c1a625","12-7ab8785a-c71e-485d-953f-0b0629c1a625","13-7ab8785a-c71e-485d-953f-0b0629c1a625","14-7ab8785a-c71e-485d-953f-0b0629c1a625","15-7ab8785a-c71e-485d-953f-0b0629c1a625","16-7ab8785a-c71e-485d-953f-0b0629c1a625","17-7ab8785a-c71e-485d-953f-0b0629c1a625","18-7ab8785a-c71e-485d-953f-0b0629c1a625","19-7ab8785a-c71e-485d-953f-0b0629c1a625"]},{"someInt":1,"someMap":{"item-0":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-1":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-2":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-3":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-4":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-5":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-6":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-7":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-8":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-9":"7ab8785a-c71e-485d-953f-0b0629c1a625"},"someSet":["0-7ab8785a-c71e-485d-953f-0b0629c1a625","1-7ab8785a-c71e-485d-953f-0b0629c1a625","2-7ab8785a-c71e-485d-953f-0b0629c1a625","3-7ab8785a-c71e-485d-953f-0b0629c1a625","4-7ab8785a-c71e-485d-953f-0b0629c1a625","5-7ab8785a-c71e-485d-953f-0b0629c1a625","6-7ab8785a-c71e-485d-953f-0b0629c1a625","7-7ab8785a-c71e-485d-953f-0b0629c1a625","8-7ab8785a-c71e-485d-953f-0b0629c1a625","9-7ab8785a-c71e-485d-953f-0b0629c1a625","10-7ab8785a-c71e-485d-953f-0b0629c1a625","11-7ab8785a-c71e-485d-953f-0b0629c1a625","12-7ab8785a-c71e-485d-953f-0b0629c1a625","13-7ab8785a-c71e-485d-953f-0b0629c1a625","14-7ab8785a-c71e-485d-953f-0b0629c1a625","15-7ab8785a-c71e-485d-953f-0b0629c1a625","16-7ab8785a-c71e-485d-953f-0b0629c1a625","17-7ab8785a-c71e-485d-953f-0b0629c1a625","18-7ab8785a-c71e-485d-953f-0b0629c1a625","19-7ab8785a-c71e-485d-953f-0b0629c1a625"]},{"someInt":1,"someMap":{"item-0":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-1":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-2":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-3":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-4":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-5":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-6":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-7":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-8":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-9":"7ab8785a-c71e-485d-953f-0b0629c1a625"},"someSet":["0-7ab8785a-c71e-485d-953f-0b0629c1a625","1-7ab8785a-c71e-485d-953f-0b0629c1a625","2-7ab8785a-c71e-485d-953f-0b0629c1a625","3-7ab8785a-c71e-485d-953f-0b0629c1a625","4-7ab8785a-c71e-485d-953f-0b0629c1a625","5-7ab8785a-c71e-485d-953f-0b0629c1a625","6-7ab8785a-c71e-485d-953f-0b0629c1a625","7-7ab8785a-c71e-485d-953f-0b0629c1a625","8-7ab8785a-c71e-485d-953f-0b0629c1a625","9-7ab8785a-c71e-485d-953f-0b0629c1a625","10-7ab8785a-c71e-485d-953f-0b0629c1a625","11-7ab8785a-c71e-485d-953f-0b0629c1a625","12-7ab8785a-c71e-485d-953f-0b0629c1a625","13-7ab8785a-c71e-485d-953f-0b0629c1a625","14-7ab8785a-c71e-485d-953f-0b0629c1a625","15-7ab8785a-c71e-485d-953f-0b0629c1a625","16-7ab8785a-c71e-485d-953f-0b0629c1a625","17-7ab8785a-c71e-485d-953f-0b0629c1a625","18-7ab8785a-c71e-485d-953f-0b0629c1a625","19-7ab8785a-c71e-485d-953f-0b0629c1a625"]},{"someInt":1,"someMap":{"item-0":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-1":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-2":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-3":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-4":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-5":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-6":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-7":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-8":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-9":"7ab8785a-c71e-485d-953f-0b0629c1a625"},"someSet":["0-7ab8785a-c71e-485d-953f-0b0629c1a625","1-7ab8785a-c71e-485d-953f-0b0629c1a625","2-7ab8785a-c71e-485d-953f-0b0629c1a625","3-7ab8785a-c71e-485d-953f-0b0629c1a625","4-7ab8785a-c71e-485d-953f-0b0629c1a625","5-7ab8785a-c71e-485d-953f-0b0629c1a625","6-7ab8785a-c71e-485d-953f-0b0629c1a625","7-7ab8785a-c71e-485d-953f-0b0629c1a625","8-7ab8785a-c71e-485d-953f-0b0629c1a625","9-7ab8785a-c71e-485d-953f-0b0629c1a625","10-7ab8785a-c71e-485d-953f-0b0629c1a625","11-7ab8785a-c71e-485d-953f-0b0629c1a625","12-7ab8785a-c71e-485d-953f-0b0629c1a625","13-7ab8785a-c71e-485d-953f-0b0629c1a625","14-7ab8785a-c71e-485d-953f-0b0629c1a625","15-7ab8785a-c71e-485d-953f-0b0629c1a625","16-7ab8785a-c71e-485d-953f-0b0629c1a625","17-7ab8785a-c71e-485d-953f-0b0629c1a625","18-7ab8785a-c71e-485d-953f-0b0629c1a625","19-7ab8785a-c71e-485d-953f-0b0629c1a625"]},{"someInt":1,"someMap":{"item-0":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-1":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-2":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-3":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-4":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-5":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-6":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-7":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-8":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-9":"7ab8785a-c71e-485d-953f-0b0629c1a625"},"someSet":["0-7ab8785a-c71e-485d-953f-0b0629c1a625","1-7ab8785a-c71e-485d-953f-0b0629c1a625","2-7ab8785a-c71e-485d-953f-0b0629c1a625","3-7ab8785a-c71e-485d-953f-0b0629c1a625","4-7ab8785a-c71e-485d-953f-0b0629c1a625","5-7ab8785a-c71e-485d-953f-0b0629c1a625","6-7ab8785a-c71e-485d-953f-0b0629c1a625","7-7ab8785a-c71e-485d-953f-0b0629c1a625","8-7ab8785a-c71e-485d-953f-0b0629c1a625","9-7ab8785a-c71e-485d-953f-0b0629c1a625","10-7ab8785a-c71e-485d-953f-0b0629c1a625","11-7ab8785a-c71e-485d-953f-0b0629c1a625","12-7ab8785a-c71e-485d-953f-0b0629c1a625","13-7ab8785a-c71e-485d-953f-0b0629c1a625","14-7ab8785a-c71e-485d-953f-0b0629c1a625","15-7ab8785a-c71e-485d-953f-0b0629c1a625","16-7ab8785a-c71e-485d-953f-0b0629c1a625","17-7ab8785a-c71e-485d-953f-0b0629c1a625","18-7ab8785a-c71e-485d-953f-0b0629c1a625","19-7ab8785a-c71e-485d-953f-0b0629c1a625"]},{"someInt":1,"someMap":{"item-0":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-1":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-2":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-3":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-4":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-5":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-6":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-7":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-8":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-9":"7ab8785a-c71e-485d-953f-0b0629c1a625"},"someSet":["0-7ab8785a-c71e-485d-953f-0b0629c1a625","1-7ab8785a-c71e-485d-953f-0b0629c1a625","2-7ab8785a-c71e-485d-953f-0b0629c1a625","3-7ab8785a-c71e-485d-953f-0b0629c1a625","4-7ab8785a-c71e-485d-953f-0b0629c1a625","5-7ab8785a-c71e-485d-953f-0b0629c1a625","6-7ab8785a-c71e-485d-953f-0b0629c1a625","7-7ab8785a-c71e-485d-953f-0b0629c1a625","8-7ab8785a-c71e-485d-953f-0b0629c1a625","9-7ab8785a-c71e-485d-953f-0b0629c1a625","10-7ab8785a-c71e-485d-953f-0b0629c1a625","11-7ab8785a-c71e-485d-953f-0b0629c1a625","12-7ab8785a-c71e-485d-953f-0b0629c1a625","13-7ab8785a-c71e-485d-953f-0b0629c1a625","14-7ab8785a-c71e-485d-953f-0b0629c1a625","15-7ab8785a-c71e-485d-953f-0b0629c1a625","16-7ab8785a-c71e-485d-953f-0b0629c1a625","17-7ab8785a-c71e-485d-953f-0b0629c1a625","18-7ab8785a-c71e-485d-953f-0b0629c1a625","19-7ab8785a-c71e-485d-953f-0b0629c1a625"]},{"someInt":1,"someMap":{"item-0":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-1":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-2":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-3":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-4":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-5":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-6":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-7":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-8":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-9":"7ab8785a-c71e-485d-953f-0b0629c1a625"},"someSet":["0-7ab8785a-c71e-485d-953f-0b0629c1a625","1-7ab8785a-c71e-485d-953f-0b0629c1a625","2-7ab8785a-c71e-485d-953f-0b0629c1a625","3-7ab8785a-c71e-485d-953f-0b0629c1a625","4-7ab8785a-c71e-485d-953f-0b0629c1a625","5-7ab8785a-c71e-485d-953f-0b0629c1a625","6-7ab8785a-c71e-485d-953f-0b0629c1a625","7-7ab8785a-c71e-485d-953f-0b0629c1a625","8-7ab8785a-c71e-485d-953f-0b0629c1a625","9-7ab8785a-c71e-485d-953f-0b0629c1a625","10-7ab8785a-c71e-485d-953f-0b0629c1a625","11-7ab8785a-c71e-485d-953f-0b0629c1a625","12-7ab8785a-c71e-485d-953f-0b0629c1a625","13-7ab8785a-c71e-485d-953f-0b0629c1a625","14-7ab8785a-c71e-485d-953f-0b0629c1a625","15-7ab8785a-c71e-485d-953f-0b0629c1a625","16-7ab8785a-c71e-485d-953f-0b0629c1a625","17-7ab8785a-c71e-485d-953f-0b0629c1a625","18-7ab8785a-c71e-485d-953f-0b0629c1a625","19-7ab8785a-c71e-485d-953f-0b0629c1a625"]},{"someInt":1,"someMap":{"item-0":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-1":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-2":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-3":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-4":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-5":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-6":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-7":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-8":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-9":"7ab8785a-c71e-485d-953f-0b0629c1a625"},"someSet":["0-7ab8785a-c71e-485d-953f-0b0629c1a625","1-7ab8785a-c71e-485d-953f-0b0629c1a625","2-7ab8785a-c71e-485d-953f-0b0629c1a625","3-7ab8785a-c71e-485d-953f-0b0629c1a625","4-7ab8785a-c71e-485d-953f-0b0629c1a625","5-7ab8785a-c71e-485d-953f-0b0629c1a625","6-7ab8785a-c71e-485d-953f-0b0629c1a625","7-7ab8785a-c71e-485d-953f-0b0629c1a625","8-7ab8785a-c71e-485d-953f-0b0629c1a625","9-7ab8785a-c71e-485d-953f-0b0629c1a625","10-7ab8785a-c71e-485d-953f-0b0629c1a625","11-7ab8785a-c71e-485d-953f-0b0629c1a625","12-7ab8785a-c71e-485d-953f-0b0629c1a625","13-7ab8785a-c71e-485d-953f-0b0629c1a625","14-7ab8785a-c71e-485d-953f-0b0629c1a625","15-7ab8785a-c71e-485d-953f-0b0629c1a625","16-7ab8785a-c71e-485d-953f-0b0629c1a625","17-7ab8785a-c71e-485d-953f-0b0629c1a625","18-7ab8785a-c71e-485d-953f-0b0629c1a625","19-7ab8785a-c71e-485d-953f-0b0629c1a625"]},{"someInt":1,"someMap":{"item-0":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-1":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-2":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-3":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-4":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-5":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-6":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-7":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-8":"7ab8785a-c71e-485d-953f-0b0629c1a625","item-9":"7ab8785a-c71e-485d-953f-0b0629c1a625"},"someSet":["0-7ab8785a-c71e-485d-953f-0b0629c1a625","1-7ab8785a-c71e-485d-953f-0b0629c1a625","2-7ab8785a-c71e-485d-953f-0b0629c1a625","3-7ab8785a-c71e-485d-953f-0b0629c1a625","4-7ab8785a-c71e-485d-953f-0b0629c1a625","5-7ab8785a-c71e-485d-953f-0b0629c1a625","6-7ab8785a-c71e-485d-953f-0b0629c1a625","7-7ab8785a-c71e-485d-953f-0b0629c1a625","8-7ab8785a-c71e-485d-953f-0b0629c1a625","9-7ab8785a-c71e-485d-953f-0b0629c1a625","10-7ab8785a-c71e-485d-953f-0b0629c1a625","11-7ab8785a-c71e-485d-953f-0b0629c1a625","12-7ab8785a-c71e-485d-953f-0b0629c1a625","13-7ab8785a-c71e-485d-953f-0b0629c1a625","14-7ab8785a-c71e-485d-953f-0b0629c1a625","15-7ab8785a-c71e-485d-953f-0b0629c1a625","16-7ab8785a-c71e-485d-953f-0b0629c1a625","17-7ab8785a-c71e-485d-953f-0b0629c1a625","18-7ab8785a-c71e-485d-953f-0b0629c1a625","19-7ab8785a-c71e-485d-953f-0b0629c1a625"]}]}
    """

    fun fromJson(json: String): DummyResponse {
      return Json.decodeFromString(serializer(), json)
    }
  }

  fun toJson(): String {
    return Json.encodeToString(serializer(), this)
  }
}

@Serializable
data class BenchmarkData(
  val someInt: Int,
  val someMap: Map<String, String>,
  val someSet: Set<String>
) {
  companion object {
    fun dummy(): BenchmarkData {
      return BenchmarkData(
        someInt = 1,
        someMap = mapOf(*Array(10) { "item-$it" to "7ab8785a-c71e-485d-953f-0b0629c1a625" }),
        someSet = Array(20) { "$it-7ab8785a-c71e-485d-953f-0b0629c1a625" }.toSet()
      )
    }
  }
}

enum class BenchmarkComputeMode {
  COMPUTE,
  NO_COMPUTE;
  companion object {
    fun from(arg: String): BenchmarkComputeMode {
      return when (arg) {
        "no_compute" -> NO_COMPUTE
        "compute" -> COMPUTE
        else -> throw RuntimeException("this should not happen")
      }
    }
  }
}