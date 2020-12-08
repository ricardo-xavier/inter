package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1958")
public class Somador1958 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
