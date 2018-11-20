import React, { Component } from 'react';
import { Grid, Row, Col, Button } from 'react-bootstrap';

class StartPage extends Component {

  render() {
    return(
      <div id="startPage">
        <Grid>
          <Row>
            <Col xs={12} md={8} xsOffset={3} mdOffset={2}>
              <h1>I want to...</h1>
            </Col>
          </Row>
          <Row className="firstPageButton">
            <Col xs={12} md={6} xsOffset={3} mdOffset={3}>
              <Button className="giveHelp" bsSize="large" block>
                Give help
              </Button>
            </Col>
            </Row>
          <Row className="firstPageButton">
            <Col xs={12} md={6} xsOffset={3} mdOffset={3}>
              <Button className="getHelp" bsSize="large" block>
                Get help
              </Button>
            </Col>
          </Row>
        </Grid>
      </div>
    );
  }

}

export default StartPage;