package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1807")
public class Somador1807 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
