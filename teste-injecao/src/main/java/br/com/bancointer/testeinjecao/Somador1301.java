package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1301")
public class Somador1301 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
