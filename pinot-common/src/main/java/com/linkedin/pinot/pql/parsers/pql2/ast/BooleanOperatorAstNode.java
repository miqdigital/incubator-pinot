/**
 * Copyright (C) 2014-2018 LinkedIn Corp. (pinot-core@linkedin.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.linkedin.pinot.pql.parsers.pql2.ast;

import com.linkedin.pinot.common.request.BrokerRequest;
import java.util.List;


/**
 * AST node for boolean operators (AND, OR). There are an enum so that we can reuse them, as they have no state.
 */
public enum BooleanOperatorAstNode implements AstNode {
  AND,
  OR;

  @Override
  public List<? extends AstNode> getChildren() {
    return null;
  }

  @Override
  public boolean hasChildren() {
    return false;
  }

  @Override
  public void addChild(AstNode childNode) {
    throw new AssertionError("Should not happen");
  }

  @Override
  public void doneProcessingChildren() {
  }

  @Override
  public AstNode getParent() {
    throw new AssertionError("Should not happen");
  }

  @Override
  public void setParent(AstNode parent) {
    // Ignored
  }

  @Override
  public boolean hasParent() {
    return false;
  }

  @Override
  public void updateBrokerRequest(BrokerRequest brokerRequest) {
  }

  @Override
  public void sendBrokerRequestUpdateToChildren(BrokerRequest brokerRequest) {
    throw new AssertionError("Should not happen");
  }

  @Override
  public String toString(int indent) {
    String str = "";
    for(int i = 0; i < indent; ++i) {
      str += " ";
    }
    str += toString();
    return str;
  }
}