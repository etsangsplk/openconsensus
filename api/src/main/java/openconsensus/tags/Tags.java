/*
 * Copyright 2019, OpenConsensus Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package openconsensus.tags;

import openconsensus.tags.propagation.TagPropagationComponent;

/**
 * Class for accessing the default {@link TagsComponent}.
 *
 * @since 0.1.0
 */
public final class Tags {
  private static final TagsComponent tagsComponent = NoopTags.newNoopTagsComponent();

  private Tags() {}

  /**
   * Returns the default {@code Tagger}.
   *
   * @return the default {@code Tagger}.
   * @since 0.1.0
   */
  public static Tagger getTagger() {
    return tagsComponent.getTagger();
  }

  /**
   * Returns the default {@code TagPropagationComponent}.
   *
   * @return the default {@code TagPropagationComponent}.
   * @since 0.1.0
   */
  public static TagPropagationComponent getTagPropagationComponent() {
    return tagsComponent.getTagPropagationComponent();
  }
}
