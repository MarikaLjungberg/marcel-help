import React, { Component } from 'react';
import { Grid, Row, Col, Button } from 'react-bootstrap';

class ChooseUsername extends Component {

  render() {
    return(
      <div id="chooseUsername">
        <Grid>
          <Row>
            <Col xs={12} md={8} xsOffset={3} mdOffset={2}>
              <h1>Choose a username:</h1>
            </Col>
          </Row>
          <Row className="usernameForm">
          <form>
              <Col xs={12} md={8} xsOffset={3} mdOffset={2}>
                <input placeholder="..."/>
                <Button type="submit" className="submitUsername" bsSize="small">
                  Submit
                </Button>
              </Col>
            </form>
            </Row>
        </Grid>
      </div>
    );
  }

}

export default ChooseUsername;