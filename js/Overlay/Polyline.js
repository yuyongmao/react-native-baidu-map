/**
 * Copyright (c) 2016-present, lovebing.org.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

import {
  requireNativeComponent,
  View
} from 'react-native';

import React, { Component } from 'react';
import PropTypes from 'prop-types';

export default class Polyline extends Component {
  static propTypes = {
    ...View.propTypes,
    points: PropTypes.array,
    stroke: PropTypes.object
  };

  static defaultProps = {
    points: [{
      latitude: 0,
      longitude: 0
    }],
    stroke: {
      width: 1,
      color: 'AAFF0000'
    }
  };

  constructor() {
    super();
  }

  render() {
    return <BaiduMapOverlayPolyline {...this.props} />;
  }
}
const BaiduMapOverlayPolyline = requireNativeComponent('BaiduMapOverlayPolyline', Polyline);