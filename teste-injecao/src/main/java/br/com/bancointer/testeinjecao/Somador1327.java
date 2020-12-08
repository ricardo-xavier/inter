package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1327")
public class Somador1327 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
