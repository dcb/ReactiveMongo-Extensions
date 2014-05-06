// Copyright (C) 2014 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package reactivemongo.extensions.dao

import reactivemongo.extensions.model.MapModel
import reactivemongo.bson.BSONObjectID
import reactivemongo.bson.DefaultBSONHandlers._

class MapModelBsonDao
    extends BsonDao[MapModel, BSONObjectID](MongoContext.db, "dummy-" + java.util.UUID.randomUUID.toString) {
}